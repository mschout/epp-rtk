package org.openrtk.idl.epp02.domain;


/**
* org/openrtk/idl/epp/domain/epp_DomainTransferRsp.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp_domain.idl
* Thursday, July 26, 2001 6:26:07 PM EDT
*/

public class epp_DomainTransferRsp implements org.omg.CORBA.portable.IDLEntity
{
  public org.openrtk.idl.epp02.epp_Response m_rsp = null;
  public String m_name = null;
  public org.openrtk.idl.epp02.epp_TransferStatusType m_transfer_status = null;
  public String m_request_client_id = null;
  public String m_action_client_id = null;
  public String m_request_date = null;
  public String m_action_date = null;
  public String m_expiration_date = null;

  public epp_DomainTransferRsp ()
  {
  } // ctor

  public epp_DomainTransferRsp (org.openrtk.idl.epp02.epp_Response _m_rsp, String _m_name, org.openrtk.idl.epp02.epp_TransferStatusType _m_transfer_status, String _m_request_client_id, String _m_action_client_id, String _m_request_date, String _m_action_date, String _m_expiration_date)
  {
    m_rsp = _m_rsp;
    m_name = _m_name;
    m_transfer_status = _m_transfer_status;
    m_request_client_id = _m_request_client_id;
    m_action_client_id = _m_action_client_id;
    m_request_date = _m_request_date;
    m_action_date = _m_action_date;
    m_expiration_date = _m_expiration_date;
  } // ctor

  public void setRsp(org.openrtk.idl.epp02.epp_Response value) { m_rsp = value; }
  public org.openrtk.idl.epp02.epp_Response getRsp() { return m_rsp; }

  public void setName(String value) { m_name = value; }
  public String getName() { return m_name; }

  public void setTransferStatus(org.openrtk.idl.epp02.epp_TransferStatusType value) { m_transfer_status = value; }
  public org.openrtk.idl.epp02.epp_TransferStatusType getTransferStatus() { return m_transfer_status; }

  public void setRequestClientId(String value) { m_request_client_id = value; }
  public String getRequestClientId() { return m_request_client_id; }

  public void setActionClientId(String value) { m_action_client_id = value; }
  public String getActionClientId() { return m_action_client_id; }

  public void setRequestDate(String value) { m_request_date = value; }
  public String getRequestDate() { return m_request_date; }

  public void setActionDate(String value) { m_action_date = value; }
  public String getActionDate() { return m_action_date; }

  public void setExpirationDate(String value) { m_expiration_date = value; }
  public String getExpirationDate() { return m_expiration_date; }

  public String toString() { return this.getClass().getName() + ": { m_rsp ["+m_rsp+"] m_name ["+m_name+"] m_transfer_status ["+m_transfer_status+"] m_request_client_id ["+m_request_client_id+"] m_action_client_id ["+m_action_client_id+"] m_request_date ["+m_request_date+"] m_action_date ["+m_action_date+"] m_expiration_date ["+m_expiration_date+"] }"; }

} // class epp_DomainTransferRsp
