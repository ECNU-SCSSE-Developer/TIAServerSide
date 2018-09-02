## 数据库模式

+ **下划线表示主码，*号表示外码**

+ **建表语句里未写入外键约束**

+ **实体为`User`,`Match`,`Recruitment`，其它表均为一对多的联系集。**

| User              |          |
| ----------------- | -------- |
| <u>student_id</u> |          |
| student_name      |          |
| grade             |          |
| major             |          |
| specialty         | 自我介绍 |
| contacts          |          |

| Match              |      |
| ------------------ | ---- |
| <u>match_id</u>    |      |
| match_name         |      |
| match_description  |      |
| match_requirements |      |
| time               |      |
| place              |      |

| Recruitment          | 招聘     |
| -------------------- | -------- |
| <u>recruit_id</u>    |          |
| recruit_name         |          |
| recruit_requirements |          |
| recruit_description  |          |
| registered_number    | 报名人数 |

| User_Focused       | 已收藏/已报名未加入 |
| ------------------ | ------------------- |
| <u>student_id</u>* |                     |
| <u>recruit_id</u>* |                     |

| User_Created       | 已加入(包含已创建) |
| ------------------ | ------------------ |
| <u>student_id</u>* |                    |
| <u>recruit_id*</u> |                    |

| User_Registered    | 已报名 |
| ------------------ | ------ |
| <u>student_id</u>* |        |
| <u>recruit_id*</u> |        |

| User_Evaluation | 评价系统 |
| --------------- | -------- |
| student_id      |          |
| comments        |          |
| ranks           |          |

| Recruit_Applicants   | 对应的注册人数 |
| -------------------- | -------------- |
| <u>recruit_id</u>*   |                |
| <u>applicant_id</u>* |                |

| Recruit_Type |      |
| ------------ | ---- |
| recruit_id*  |      |
| recruit_type |      |

| Match_Recruit      | 对应的比赛 |
| ------------------ | ---------- |
| <u>match_id</u>*   |            |
| <u>recruit_id</u>* |            |

| Match_Type |      |
| ---------- | ---- |
| match_id*  |      |
| match_type |      |