package org.openrtk.idl.epp02;


/**
* org/openrtk/idl/epp/epp_PollReq.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp.idl
* Thursday, July 26, 2001 6:26:04 PM EDT
*/


////////////
public class epp_PollReq implements org.omg.CORBA.portable.IDLEntity
{
  public org.openrtk.idl.epp02.epp_Command m_cmd = null;
  public org.openrtk.idl.epp02.epp_PollOpType m_op = null;
  public String m_msgID = null;

  public epp_PollReq ()
  {
  } // ctor

  public epp_PollReq (org.openrtk.idl.epp02.epp_Command _m_cmd, org.openrtk.idl.epp02.epp_PollOpType _m_op, String _m_msgID)
  {
    m_cmd = _m_cmd;
    m_op = _m_op;
    m_msgID = _m_msgID;
  } // ctor

  public void setCmd(org.openrtk.idl.epp02.epp_Command value) { m_cmd = value; }
  public org.openrtk.idl.epp02.epp_Command getCmd() { return m_cmd; }

  public void setOp(org.openrtk.idl.epp02.epp_PollOpType value) { m_op = value; }
  public org.openrtk.idl.epp02.epp_PollOpType getOp() { return m_op; }

  public void setMsgID(String value) { m_msgID = value; }
  public String getMsgID() { return m_msgID; }

  public String toString() { return this.getClass().getName() + ": { m_cmd ["+m_cmd+"] m_op ["+m_op+"] m_msgID ["+m_msgID+"] }"; }

} // class epp_PollReq