/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.naughter.aaplus;

public class CAAEasterDetails {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CAAEasterDetails(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CAAEasterDetails obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AAJNI.delete_CAAEasterDetails(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CAAEasterDetails() {
    this(AAJNI.new_CAAEasterDetails(), true);
  }

  public void setMonth(int value) {
    AAJNI.CAAEasterDetails_Month_set(swigCPtr, this, value);
  }

  public int getMonth() {
    return AAJNI.CAAEasterDetails_Month_get(swigCPtr, this);
  }

  public void setDay(int value) {
    AAJNI.CAAEasterDetails_Day_set(swigCPtr, this, value);
  }

  public int getDay() {
    return AAJNI.CAAEasterDetails_Day_get(swigCPtr, this);
  }

}
