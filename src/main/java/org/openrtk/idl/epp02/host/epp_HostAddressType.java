package org.openrtk.idl.epp02.host;


/**
* org/openrtk/idl/epp/host/epp_HostAddressType.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp_host.idl
* Thursday, July 26, 2001 6:26:09 PM EDT
*/

public class epp_HostAddressType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.openrtk.idl.epp02.host.epp_HostAddressType[] __array = new org.openrtk.idl.epp02.host.epp_HostAddressType [__size];

  public static final int _IPV4 = 0;
  public static final org.openrtk.idl.epp02.host.epp_HostAddressType IPV4 = new org.openrtk.idl.epp02.host.epp_HostAddressType(_IPV4);
  public static final int _IPV6 = 1;
  public static final org.openrtk.idl.epp02.host.epp_HostAddressType IPV6 = new org.openrtk.idl.epp02.host.epp_HostAddressType(_IPV6);

  public int value ()
  {
    return __value;
  }

  public static org.openrtk.idl.epp02.host.epp_HostAddressType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected epp_HostAddressType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class epp_HostAddressType