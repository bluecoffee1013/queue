/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/7/2 23:20:35                            */
/*==============================================================*/


drop table if exists sys_admin;

drop table if exists sys_admin_role;

drop table if exists sys_menu;

drop table if exists sys_role;

drop table if exists sys_role_auth;

drop table if exists user_order;

/*==============================================================*/
/* Table: sys_admin                                             */
/*==============================================================*/
create table sys_admin
(
   admin_id             bigint not null,
   login_account        varchar(20) not null,
   login_pwd            varchar(20) not null,
   pwd_type             int not null comment '1-明文
            2-MD5',
   realname             varchar(10),
   mobile               varchar(20),
   email                varchar(50),
   primary key (admin_id)
);

/*==============================================================*/
/* Table: sys_admin_role                                        */
/*==============================================================*/
create table sys_admin_role
(
   admin_role_id        bigint not null,
   admin_id             bigint not null,
   role_id              bigint not null,
   primary key (admin_role_id)
);

/*==============================================================*/
/* Table: sys_menu                                              */
/*==============================================================*/
create table sys_menu
(
   menu_id              varchar(20) not null,
   parent_menu_id       varchar(20),
   menu_name            varchar(20) not null,
   menu_link            varchar(100) not null,
   menu_type            int not null comment '1-一级菜单
            2-图标',
   primary key (menu_id)
);

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   role_id              bigint not null,
   role_name            varchar(20) not null,
   primary key (role_id)
);

/*==============================================================*/
/* Table: sys_role_auth                                         */
/*==============================================================*/
create table sys_role_auth
(
   auth_id              bigint not null,
   role_id              bigint not null,
   menu_id              varchar(20) not null,
   primary key (auth_id)
);

/*==============================================================*/
/* Table: user_order                                            */
/*==============================================================*/
create table user_order
(
   order_id             bigint not null auto_increment,
   user_name            varchar(10),
   gender               int,
   id_card_number       varchar(30),
   social_card_number   varchar(30),
   user_mobile          char(10),
   order_type           int,
   order_date           datetime,
   order_apply_time     datetime,
   order_number         int,
   get_orderr_time      datetime,
   effective_time       datetime,
   state                char(10),
   create_operator      varchar(20),
   create_time          datetime,
   update_operator      varchar(20),
   update_time          datetime,
   primary key (order_id)
);

