/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAPlanetaryPhenomena {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;

    protected CAAPlanetaryPhenomena(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAPlanetaryPhenomena obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAPlanetaryPhenomena(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double K(double Year, CAAPlanetaryPhenomena.PlanetaryObject object, CAAPlanetaryPhenomena.EventType type) {
        return AAJNI.CAAPlanetaryPhenomena_K(Year, object.swigValue(), type.swigValue());
    }

    public static double Mean(double k, CAAPlanetaryPhenomena.PlanetaryObject object, CAAPlanetaryPhenomena.EventType type) {
        return AAJNI.CAAPlanetaryPhenomena_Mean(k, object.swigValue(), type.swigValue());
    }

    public static double True(double k, CAAPlanetaryPhenomena.PlanetaryObject object, CAAPlanetaryPhenomena.EventType type) {
        return AAJNI.CAAPlanetaryPhenomena_True(k, object.swigValue(), type.swigValue());
    }

    public static double ElongationValue(double k, CAAPlanetaryPhenomena.PlanetaryObject object, boolean bEastern) {
        return AAJNI.CAAPlanetaryPhenomena_ElongationValue(k, object.swigValue(), bEastern);
    }

    public CAAPlanetaryPhenomena() {
        this(AAJNI.new_CAAPlanetaryPhenomena(), true);
    }

    public final static class PlanetaryObject {
        public final static CAAPlanetaryPhenomena.PlanetaryObject MERCURY = new CAAPlanetaryPhenomena.PlanetaryObject("MERCURY");
        public final static CAAPlanetaryPhenomena.PlanetaryObject VENUS = new CAAPlanetaryPhenomena.PlanetaryObject("VENUS");
        public final static CAAPlanetaryPhenomena.PlanetaryObject MARS = new CAAPlanetaryPhenomena.PlanetaryObject("MARS");
        public final static CAAPlanetaryPhenomena.PlanetaryObject JUPITER = new CAAPlanetaryPhenomena.PlanetaryObject("JUPITER");
        public final static CAAPlanetaryPhenomena.PlanetaryObject SATURN = new CAAPlanetaryPhenomena.PlanetaryObject("SATURN");
        public final static CAAPlanetaryPhenomena.PlanetaryObject URANUS = new CAAPlanetaryPhenomena.PlanetaryObject("URANUS");
        public final static CAAPlanetaryPhenomena.PlanetaryObject NEPTUNE = new CAAPlanetaryPhenomena.PlanetaryObject("NEPTUNE");

        public final int swigValue() {
            return swigValue;
        }

        public String toString() {
            return swigName;
        }

        public static PlanetaryObject swigToEnum(int swigValue) {
            if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
                return swigValues[swigValue];
            for (int i = 0; i < swigValues.length; i++)
                if (swigValues[i].swigValue == swigValue)
                    return swigValues[i];
            throw new IllegalArgumentException("No enum " + PlanetaryObject.class + " with value " + swigValue);
        }

        private PlanetaryObject(String swigName) {
            this.swigName = swigName;
            this.swigValue = swigNext++;
        }

        private PlanetaryObject(String swigName, int swigValue) {
            this.swigName = swigName;
            this.swigValue = swigValue;
            swigNext = swigValue + 1;
        }

        private PlanetaryObject(String swigName, PlanetaryObject swigEnum) {
            this.swigName = swigName;
            this.swigValue = swigEnum.swigValue;
            swigNext = this.swigValue + 1;
        }

        private static PlanetaryObject[] swigValues = {MERCURY, VENUS, MARS, JUPITER, SATURN, URANUS, NEPTUNE};
        private static int swigNext = 0;
        private final int swigValue;
        private final String swigName;
    }

    public final static class EventType {
        public final static CAAPlanetaryPhenomena.EventType INFERIOR_CONJUNCTION = new CAAPlanetaryPhenomena.EventType("INFERIOR_CONJUNCTION");
        public final static CAAPlanetaryPhenomena.EventType SUPERIOR_CONJUNCTION = new CAAPlanetaryPhenomena.EventType("SUPERIOR_CONJUNCTION");
        public final static CAAPlanetaryPhenomena.EventType OPPOSITION = new CAAPlanetaryPhenomena.EventType("OPPOSITION");
        public final static CAAPlanetaryPhenomena.EventType CONJUNCTION = new CAAPlanetaryPhenomena.EventType("CONJUNCTION");
        public final static CAAPlanetaryPhenomena.EventType EASTERN_ELONGATION = new CAAPlanetaryPhenomena.EventType("EASTERN_ELONGATION");
        public final static CAAPlanetaryPhenomena.EventType WESTERN_ELONGATION = new CAAPlanetaryPhenomena.EventType("WESTERN_ELONGATION");
        public final static CAAPlanetaryPhenomena.EventType STATION1 = new CAAPlanetaryPhenomena.EventType("STATION1");
        public final static CAAPlanetaryPhenomena.EventType STATION2 = new CAAPlanetaryPhenomena.EventType("STATION2");

        public final int swigValue() {
            return swigValue;
        }

        public String toString() {
            return swigName;
        }

        public static EventType swigToEnum(int swigValue) {
            if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
                return swigValues[swigValue];
            for (int i = 0; i < swigValues.length; i++)
                if (swigValues[i].swigValue == swigValue)
                    return swigValues[i];
            throw new IllegalArgumentException("No enum " + EventType.class + " with value " + swigValue);
        }

        private EventType(String swigName) {
            this.swigName = swigName;
            this.swigValue = swigNext++;
        }

        private EventType(String swigName, int swigValue) {
            this.swigName = swigName;
            this.swigValue = swigValue;
            swigNext = swigValue + 1;
        }

        private EventType(String swigName, EventType swigEnum) {
            this.swigName = swigName;
            this.swigValue = swigEnum.swigValue;
            swigNext = this.swigValue + 1;
        }

        private static EventType[] swigValues = {INFERIOR_CONJUNCTION, SUPERIOR_CONJUNCTION, OPPOSITION, CONJUNCTION, EASTERN_ELONGATION, WESTERN_ELONGATION, STATION1, STATION2};
        private static int swigNext = 0;
        private final int swigValue;
        private final String swigName;
    }

}
