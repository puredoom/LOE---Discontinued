package drealm.util;

import lotr.common.fac.LOTRControlZone;
import lotr.common.world.map.LOTRWaypoint;

public class DRControlZones {


    private static final double MAP_WIDTH = 3200.0;
    private static final double MAP_HEIGHT = 4000.0;

    public static class RectangularControlZone extends LOTRControlZone {
        public final double mapX1;
        public final double mapY1;
        public final double mapX2;
        public final double mapY2;

        public RectangularControlZone(double x1, double y1, double x2, double y2) {
            super((x1 + x2) / 2, (y1 + y2) / 2, (int) Math.max(x2 - x1, y2 - y1) / 2);
            this.mapX1 = x1;
            this.mapY1 = y1;
            this.mapX2 = x2;
            this.mapY2 = y2;
        }

        @Override
        public boolean inZone(double x, double y, double z, int extraMapRange) {
            double extraRange = LOTRWaypoint.mapToWorldR(extraMapRange);
            return x >= (mapX1 - extraRange) && x <= (mapX2 + extraRange) && z >= (mapY1 - extraRange) && z <= (mapY2 + extraRange);
        }

        @Override
        public boolean intersectsWith(LOTRControlZone other, int extraMapRadius) {
            if (!(other instanceof RectangularControlZone)) {
                return false;
            }
            RectangularControlZone otherRect = (RectangularControlZone) other;
            double extraRange = LOTRWaypoint.mapToWorldR(extraMapRadius);
            return !(otherRect.mapX2 + extraRange < this.mapX1 - extraRange ||
                    otherRect.mapX1 - extraRange > this.mapX2 + extraRange ||
                    otherRect.mapY2 + extraRange < this.mapY1 - extraRange ||
                    otherRect.mapY1 - extraRange > this.mapY2 + extraRange);
        }
    }

    public static RectangularControlZone createFullMapControlZone() {
        return new RectangularControlZone(0, 0, MAP_WIDTH, MAP_HEIGHT);
    }
}
