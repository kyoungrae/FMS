package com.fms.common;

import com.system.common.base.Common;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.sql.Date;
import java.util.Arrays;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "COMMON_FILE")
public class CommonFile extends Common {
    @Transient
	private String keys = Arrays.toString(new String[]{"uuid"});


    /***<pre> uuid : 공통아이디 </pre> */
    @Id
	private String uuid;

    /***<pre> system_create_date : 작성일 </pre> */
	private Date system_create_date;

    /***<pre> system_create_userid : 작성자 아이디 </pre> */
	private String system_create_userid;

    /***<pre> system_update_date : 수정일자 </pre> */
	private Date system_update_date;

    /***<pre> system_update_userid : 수정자 아이디 </pre> */
	private String system_update_userid;



    /***<pre> uuid : 공통아이디 </pre> */
    @Transient
	private String _uuid;

    /***<pre> system_create_date : 작성일 </pre> */
    @Transient
	private Date _system_create_date;

    /***<pre> system_create_userid : 작성자 아이디 </pre> */
    @Transient
	private String _system_create_userid;

    /***<pre> system_update_date : 수정일자 </pre> */
    @Transient
	private Date _system_update_date;

    /***<pre> system_update_userid : 수정자 아이디 </pre> */
    @Transient
	private String _system_update_userid;

}