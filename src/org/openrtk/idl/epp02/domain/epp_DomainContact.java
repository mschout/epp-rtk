package org.openrtk.idl.epp02.domain;


/**
* org/openrtk/idl/epp/domain/epp_DomainContact.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from epp_domain.idl
* Thursday, July 26, 2001 6:26:07 PM EDT
*/

public class epp_DomainContact implements org.omg.CORBA.portable.IDLEntity
{
  public org.openrtk.idl.epp02.domain.epp_DomainContactType m_type = null;
  public String m_roid = null;

  public epp_DomainContact ()
  {
  } // ctor

  public epp_DomainContact (org.openrtk.idl.epp02.domain.epp_DomainContactType _m_type, String _m_roid)
  {
    m_type = _m_type;
    m_roid = _m_roid;
  } // ctor

  public void setType(org.openrtk.idl.epp02.domain.epp_DomainContactType value) { m_type = value; }
  public org.openrtk.idl.epp02.domain.epp_DomainContactType getType() { return m_type; }

  public void setRoid(String value) { m_roid = value; }
  public String getRoid() { return m_roid; }

  public String toString() { return this.getClass().getName() + ": { m_type ["+m_type+"] m_roid ["+m_roid+"] }"; }

} // class epp_DomainContact