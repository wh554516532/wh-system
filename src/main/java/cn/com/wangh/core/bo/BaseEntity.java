package cn.com.wangh.core.bo;

import java.io.Serializable;
import java.sql.Timestamp;

import cn.com.wangh.core.enums.EntityStatus;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private Timestamp created;
	
	private Timestamp updated;
	
	private Long version;
	
	private EntityStatus status;

	public BaseEntity() {
		super();
	}

	public BaseEntity(String id, Timestamp created, Timestamp updated, Long version, EntityStatus status) {
		super();
		this.id = id;
		this.created = created;
		this.updated = updated;
		this.version = version;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public EntityStatus getStatus() {
		return status;
	}

	public void setStatus(EntityStatus status) {
		this.status = status;
	}
}