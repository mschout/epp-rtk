package org.openrtk.idl.epp02;


/**
* org/openrtk/idl/epp/epp_PollRsp.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp.idl
* Thursday, July 26, 2001 6:26:04 PM EDT
*/

public class epp_PollRsp implements org.omg.CORBA.portable.IDLEntity
{
  public org.openrtk.idl.epp02.epp_Response m_rsp = null;
  public org.openrtk.idl.epp02.epp_PollResData m_res_data = null;

  public epp_PollRsp ()
  {
  } // ctor

  public epp_PollRsp (org.openrtk.idl.epp02.epp_Response _m_rsp, org.openrtk.idl.epp02.epp_PollResData _m_res_data)
  {
    m_rsp = _m_rsp;
    m_res_data = _m_res_data;
  } // ctor

  public void setRsp(org.openrtk.idl.epp02.epp_Response value) { m_rsp = value; }
  public org.openrtk.idl.epp02.epp_Response getRsp() { return m_rsp; }

  public void setResData(org.openrtk.idl.epp02.epp_PollResData value) { m_res_data = value; }
  public org.openrtk.idl.epp02.epp_PollResData getResData() { return m_res_data; }

  public String toString() { return this.getClass().getName() + ": { m_rsp ["+m_rsp+"] m_res_data ["+m_res_data+"] }"; }

} // class epp_PollRsp
