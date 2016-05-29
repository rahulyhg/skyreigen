/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAASun {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAASun(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAASun obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAASun(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static double GeometricEclipticLongitude(double JD) {
        return AAJNI.CAASun_GeometricEclipticLongitude(JD);
    }

    public static double GeometricEclipticLatitude(double JD) {
        return AAJNI.CAASun_GeometricEclipticLatitude(JD);
    }

    public static double GeometricEclipticLongitudeJ2000(double JD) {
        return AAJNI.CAASun_GeometricEclipticLongitudeJ2000(JD);
    }

    public static double GeometricEclipticLatitudeJ2000(double JD) {
        return AAJNI.CAASun_GeometricEclipticLatitudeJ2000(JD);
    }

    public static double GeometricFK5EclipticLongitude(double JD) {
        return AAJNI.CAASun_GeometricFK5EclipticLongitude(JD);
    }

    public static double GeometricFK5EclipticLatitude(double JD) {
        return AAJNI.CAASun_GeometricFK5EclipticLatitude(JD);
    }

    public static double ApparentEclipticLongitude(double JD) {
        return AAJNI.CAASun_ApparentEclipticLongitude(JD);
    }

    public static double ApparentEclipticLatitude(double JD) {
        return AAJNI.CAASun_ApparentEclipticLatitude(JD);
    }

    public static CAA3DCoordinate EquatorialRectangularCoordinatesMeanEquinox(double JD) {
        return new CAA3DCoordinate(AAJNI.CAASun_EquatorialRectangularCoordinatesMeanEquinox(JD), true);
    }

    public static CAA3DCoordinate EclipticRectangularCoordinatesJ2000(double JD) {
        return new CAA3DCoordinate(AAJNI.CAASun_EclipticRectangularCoordinatesJ2000(JD), true);
    }

    public static CAA3DCoordinate EquatorialRectangularCoordinatesJ2000(double JD) {
        return new CAA3DCoordinate(AAJNI.CAASun_EquatorialRectangularCoordinatesJ2000(JD), true);
    }

    public static CAA3DCoordinate EquatorialRectangularCoordinatesB1950(double JD) {
        return new CAA3DCoordinate(AAJNI.CAASun_EquatorialRectangularCoordinatesB1950(JD), true);
    }

    public static CAA3DCoordinate EquatorialRectangularCoordinatesAnyEquinox(double JD, double JDEquinox) {
        return new CAA3DCoordinate(AAJNI.CAASun_EquatorialRectangularCoordinatesAnyEquinox(JD, JDEquinox), true);
    }

    public CAASun() {
        this(AAJNI.new_CAASun(), true);
    }

}