/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.pojos;


import diamond.cms.server.model.jooq.tables.interfaces.ICGuest;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CGuestPojo implements ICGuest {

    private static final long serialVersionUID = 1808806012;

    private String    id;
    private String    email;
    private Timestamp createTime;
    private Timestamp loginTime;
    private String    thirdData;
    private String    nickname;
    private String    avatar;

    public CGuestPojo() {}

    public CGuestPojo(CGuestPojo value) {
        this.id = value.id;
        this.email = value.email;
        this.createTime = value.createTime;
        this.loginTime = value.loginTime;
        this.thirdData = value.thirdData;
        this.nickname = value.nickname;
        this.avatar = value.avatar;
    }

    public CGuestPojo(
        String    id,
        String    email,
        Timestamp createTime,
        Timestamp loginTime,
        String    thirdData,
        String    nickname,
        String    avatar
    ) {
        this.id = id;
        this.email = email;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.thirdData = thirdData;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    @NotNull
    @Size(max = 40)
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 100)
    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Timestamp getCreateTime() {
        return this.createTime;
    }

    @Override
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public Timestamp getLoginTime() {
        return this.loginTime;
    }

    @Override
    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Size(max = 65535)
    @Override
    public String getThirdData() {
        return this.thirdData;
    }

    @Override
    public void setThirdData(String thirdData) {
        this.thirdData = thirdData;
    }

    @Size(max = 255)
    @Override
    public String getNickname() {
        return this.nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Size(max = 180)
    @Override
    public String getAvatar() {
        return this.avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CGuestPojo (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(createTime);
        sb.append(", ").append(loginTime);
        sb.append(", ").append(thirdData);
        sb.append(", ").append(nickname);
        sb.append(", ").append(avatar);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICGuest from) {
        setId(from.getId());
        setEmail(from.getEmail());
        setCreateTime(from.getCreateTime());
        setLoginTime(from.getLoginTime());
        setThirdData(from.getThirdData());
        setNickname(from.getNickname());
        setAvatar(from.getAvatar());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICGuest> E into(E into) {
        into.from(this);
        return into;
    }
}
