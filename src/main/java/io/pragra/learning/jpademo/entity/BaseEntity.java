package io.pragra.learning.jpademo.entity;

import javax.persistence.Column;
import java.util.Date;

public class BaseEntity {

    @Column()
    protected Date createDate;

    @Column()
    protected Date lastUpdateDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
