/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAADate {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;

    protected CAADate(long cPtr, boolean cMemoryOwn) {
        swigCMemOwn = cMemoryOwn;
        swigCPtr = cPtr;
    }

    protected static long getCPtr(CAADate obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                AAJNI.delete_CAADate(swigCPtr);
            }
            swigCPtr = 0;
        }
    }

    public CAADate() {
        this(AAJNI.new_CAADate__SWIG_0(), true);
    }

    public CAADate(int Year, int Month, double Day, boolean bGregorianCalendar) {
        this(AAJNI.new_CAADate__SWIG_1(Year, Month, Day, bGregorianCalendar), true);
    }

    public CAADate(int Year, int Month, double Day, double Hour, double Minute, double Second, boolean bGregorianCalendar) {
        this(AAJNI.new_CAADate__SWIG_2(Year, Month, Day, Hour, Minute, Second, bGregorianCalendar), true);
    }

    public CAADate(double JD, boolean bGregorianCalendar) {
        this(AAJNI.new_CAADate__SWIG_3(JD, bGregorianCalendar), true);
    }

    public static double DateToJD(int Year, int Month, double Day, boolean bGregorianCalendar) {
        return AAJNI.CAADate_DateToJD(Year, Month, Day, bGregorianCalendar);
    }

    public static boolean IsLeap(int Year, boolean bGregorianCalendar) {
        return AAJNI.CAADate_IsLeap(Year, bGregorianCalendar);
    }

    public static void DayOfYearToDayAndMonth(int DayOfYear, boolean bLeap, SWIGTYPE_p_long DayOfMonth, SWIGTYPE_p_long Month) {
        AAJNI.CAADate_DayOfYearToDayAndMonth(DayOfYear, bLeap, SWIGTYPE_p_long.getCPtr(DayOfMonth), SWIGTYPE_p_long.getCPtr(Month));
    }

    public static CAACalendarDate JulianToGregorian(int Year, int Month, int Day) {
        return new CAACalendarDate(AAJNI.CAADate_JulianToGregorian(Year, Month, Day), true);
    }

    public static CAACalendarDate GregorianToJulian(int Year, int Month, int Day) {
        return new CAACalendarDate(AAJNI.CAADate_GregorianToJulian(Year, Month, Day), true);
    }

    public static int INT(double value) {
        return AAJNI.CAADate_INT(value);
    }

    public static boolean AfterPapalReform(int Year, int Month, double Day) {
        return AAJNI.CAADate_AfterPapalReform__SWIG_0(Year, Month, Day);
    }

    public static boolean AfterPapalReform(double JD) {
        return AAJNI.CAADate_AfterPapalReform__SWIG_1(JD);
    }

    public static double DayOfYear(double JD, int Year, boolean bGregorianCalendar) {
        return AAJNI.CAADate_DayOfYear__SWIG_0(JD, Year, bGregorianCalendar);
    }

    public static int DaysInMonth(int Month, boolean bLeap) {
        return AAJNI.CAADate_DaysInMonth__SWIG_0(Month, bLeap);
    }

    public double Julian() {
        return AAJNI.CAADate_Julian(swigCPtr, this);
    }

    public int Day() {
        return AAJNI.CAADate_Day(swigCPtr, this);
    }

    public int Month() {
        return AAJNI.CAADate_Month(swigCPtr, this);
    }

    public int Year() {
        return AAJNI.CAADate_Year(swigCPtr, this);
    }

    public int Hour() {
        return AAJNI.CAADate_Hour(swigCPtr, this);
    }

    public int Minute() {
        return AAJNI.CAADate_Minute(swigCPtr, this);
    }

    public double Second() {
        return AAJNI.CAADate_Second(swigCPtr, this);
    }

    public void Set(int Year, int Month, double Day, double Hour, double Minute, double Second, boolean bGregorianCalendar) {
        AAJNI.CAADate_Set__SWIG_0(swigCPtr, this, Year, Month, Day, Hour, Minute, Second, bGregorianCalendar);
    }

    public void Set(double JD, boolean bGregorianCalendar) {
        AAJNI.CAADate_Set__SWIG_1(swigCPtr, this, JD, bGregorianCalendar);
    }

    public void SetInGregorianCalendar(boolean bGregorianCalendar) {
        AAJNI.CAADate_SetInGregorianCalendar(swigCPtr, this, bGregorianCalendar);
    }

    public void Get(SWIGTYPE_p_long Year, SWIGTYPE_p_long Month, SWIGTYPE_p_long Day, SWIGTYPE_p_long Hour, SWIGTYPE_p_long Minute, SWIGTYPE_p_double Second) {
        AAJNI.CAADate_Get(swigCPtr, this, SWIGTYPE_p_long.getCPtr(Year), SWIGTYPE_p_long.getCPtr(Month), SWIGTYPE_p_long.getCPtr(Day), SWIGTYPE_p_long.getCPtr(Hour), SWIGTYPE_p_long.getCPtr(Minute), SWIGTYPE_p_double.getCPtr(Second));
    }

    public CAADate.DAY_OF_WEEK DayOfWeek() {
        return CAADate.DAY_OF_WEEK.swigToEnum(AAJNI.CAADate_DayOfWeek(swigCPtr, this));
    }

    public double DayOfYear() {
        return AAJNI.CAADate_DayOfYear__SWIG_1(swigCPtr, this);
    }

    public int DaysInMonth() {
        return AAJNI.CAADate_DaysInMonth__SWIG_1(swigCPtr, this);
    }

    public int DaysInYear() {
        return AAJNI.CAADate_DaysInYear(swigCPtr, this);
    }

    public boolean Leap() {
        return AAJNI.CAADate_Leap(swigCPtr, this);
    }

    public boolean InGregorianCalendar() {
        return AAJNI.CAADate_InGregorianCalendar(swigCPtr, this);
    }

    public double FractionalYear() {
        return AAJNI.CAADate_FractionalYear(swigCPtr, this);
    }

    public final static class DAY_OF_WEEK {
        public final static CAADate.DAY_OF_WEEK SUNDAY = new CAADate.DAY_OF_WEEK("SUNDAY", AAJNI.CAADate_SUNDAY_get());
        public final static CAADate.DAY_OF_WEEK MONDAY = new CAADate.DAY_OF_WEEK("MONDAY", AAJNI.CAADate_MONDAY_get());
        public final static CAADate.DAY_OF_WEEK TUESDAY = new CAADate.DAY_OF_WEEK("TUESDAY", AAJNI.CAADate_TUESDAY_get());
        public final static CAADate.DAY_OF_WEEK WEDNESDAY = new CAADate.DAY_OF_WEEK("WEDNESDAY", AAJNI.CAADate_WEDNESDAY_get());
        public final static CAADate.DAY_OF_WEEK THURSDAY = new CAADate.DAY_OF_WEEK("THURSDAY", AAJNI.CAADate_THURSDAY_get());
        public final static CAADate.DAY_OF_WEEK FRIDAY = new CAADate.DAY_OF_WEEK("FRIDAY", AAJNI.CAADate_FRIDAY_get());
        public final static CAADate.DAY_OF_WEEK SATURDAY = new CAADate.DAY_OF_WEEK("SATURDAY", AAJNI.CAADate_SATURDAY_get());

        public final int swigValue() {
            return swigValue;
        }

        public String toString() {
            return swigName;
        }

        public static DAY_OF_WEEK swigToEnum(int swigValue) {
            if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
                return swigValues[swigValue];
            for (int i = 0; i < swigValues.length; i++)
                if (swigValues[i].swigValue == swigValue)
                    return swigValues[i];
            throw new IllegalArgumentException("No enum " + DAY_OF_WEEK.class + " with value " + swigValue);
        }

        private DAY_OF_WEEK(String swigName) {
            this.swigName = swigName;
            this.swigValue = swigNext++;
        }

        private DAY_OF_WEEK(String swigName, int swigValue) {
            this.swigName = swigName;
            this.swigValue = swigValue;
            swigNext = swigValue + 1;
        }

        private DAY_OF_WEEK(String swigName, DAY_OF_WEEK swigEnum) {
            this.swigName = swigName;
            this.swigValue = swigEnum.swigValue;
            swigNext = this.swigValue + 1;
        }

        private static DAY_OF_WEEK[] swigValues = {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
        private static int swigNext = 0;
        private final int swigValue;
        private final String swigName;
    }

}
