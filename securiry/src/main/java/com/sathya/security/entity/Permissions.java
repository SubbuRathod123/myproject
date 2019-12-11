package com.sathya.security.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Permissions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer permisionid;
	private String permisionname;
	private String permissiondecription;
	@Transient
	private Integer roleid;

	@ManyToOne
	@JoinColumn(name = "roleid")
	private Roles roles;

	public Integer getPermisionid() {
		return permisionid;
	}

	public void setPermisionid(Integer permisionid) {
		this.permisionid = permisionid;
	}

	public String getPermisionname() {
		return permisionname;
	}

	public void setPermisionname(String permisionname) {
		this.permisionname = permisionname;
	}

	public String getPermissiondecription() {
		return permissiondecription;
	}

	public void setPermissiondecription(String permissiondecription) {
		this.permissiondecription = permissiondecription;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "Permissions [permisionid=" + permisionid + ", permisionname=" + permisionname
				+ ", permissiondecription=" + permissiondecription + ", roleid=" + roleid + "]";
	}
}