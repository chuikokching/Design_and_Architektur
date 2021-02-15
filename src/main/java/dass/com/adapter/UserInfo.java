package dass.com.adapter;

public class UserInfo implements IUserInfo {
    public String getUserName() {
        System.out.println("这里是员工的名字...");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    public String getMobileNumber() {
        System.out.println("员工的手机电话是...");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("员工的办公电话是...");
        return null;
    }

    public String getJobPosition() {
        System.out.println("员工的职位是...");
        return null;
    }

    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是...");
        return null;
    }
}
