/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAParallax {
    private long swigCPtr;
    protected boolean swigCMemOwn;

    protected CAAParallax(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAAParallax obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAAParallax(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public static CAA2DCoordinate Equatorial2TopocentricDelta(double Alpha, double Delta, double Distance, double Longitude, double Latitude, double Height, double JD) {
        return new CAA2DCoordinate(AAJNI.CAAParallax_Equatorial2TopocentricDelta(Alpha, Delta, Distance, Longitude, Latitude, Height, JD), true);
    }

    public static CAA2DCoordinate Equatorial2Topocentric(double Alpha, double Delta, double Distance, double Longitude, double Latitude, double Height, double JD) {
        return new CAA2DCoordinate(AAJNI.CAAParallax_Equatorial2Topocentric(Alpha, Delta, Distance, Longitude, Latitude, Height, JD), true);
    }

    public static CAATopocentricEclipticDetails Ecliptic2Topocentric(double Lambda, double Beta, double Semidiameter, double Distance, double Epsilon, double Latitude, double Height, double JD) {
        return new CAATopocentricEclipticDetails(AAJNI.CAAParallax_Ecliptic2Topocentric(Lambda, Beta, Semidiameter, Distance, Epsilon, Latitude, Height, JD), true);
    }

    public static double ParallaxToDistance(double Parallax) {
        return AAJNI.CAAParallax_ParallaxToDistance(Parallax);
    }

    public static double DistanceToParallax(double Distance) {
        return AAJNI.CAAParallax_DistanceToParallax(Distance);
    }

    public CAAParallax() {
        this(AAJNI.new_CAAParallax(), true);
    }

}