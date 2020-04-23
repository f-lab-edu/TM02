package me.naming.foodservice.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "MEMBERS")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "STATUS")
  private String status;

  @Column(name = "NAME")
  private String name;

  @Column(name = "EMAIL")
  private String email;

  @Column(name = "MOBILE_NUM")
  private String mobileNum;

  @Column(name = "CREATE_DATE")
  private Date createDate;

  @Column(name = "UPDATE_DATE")
  private Date updateAt;

  public Member(String status, String name, String email, String mobileNum) {
    this.status = status;
    this.name = name;
    this.email = email;
    this.mobileNum = mobileNum;
  }
}
