package btvn_locator_buoi20;
import org.openqa.selenium.By;


public class hrmAdminPage {
    //1 Menu "Admin"
    By menuAdmin = By.xpath("//a[contains(@class,'oxd-main-menu-item')][span[text()='Admin']]");

    //2 Menu "PIM"
    By menuPIM   = By.xpath("//a[contains(@class,'oxd-main-menu-item')][span[text()='PIM']]");

    //3 Menu "Leave"
    By menuLeave = By.xpath("//a[contains(@class,'oxd-main-menu-item')][span[text()='Leave']]");

    //4 Ô input nhập "Username"
    By txtUsername = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");

    //5 Dropdown "User Role"
    By ddlUserRole = By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text--active')]");

    //6 Option "Admin" trong dropdown User Role
    By optUserRoleAdmin = By.xpath("//div[@role='listbox']//span[text()='Admin']");

    //7 Option "ESS" trong dropdown User Role
    By optUserRoleESS   = By.xpath("//div[@role='listbox']//span[text()='ESS']");

    //8 Ô input nhập "Employee Name"
    By txtEmployeeName = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");

    //9 Nút "Reset"
    By btnReset  = By.xpath("//button[normalize-space()='Reset']");

    //10 Nút "Search"
    By btnSearch = By.xpath("//button[normalize-space()='Search']");

    //11 Meny Top tab "User Management"
    By tabUserManagement = By.xpath("//span[contains(@class,'oxd-topbar-body-nav-tab-item') and normalize-space()='User Management']");

    //12 Checkbox dòng thứ 2
    By chkRow2          = By.xpath("(//div[@class='oxd-table-body']/div[contains(@class,'oxd-table-card')])[2]//input[@type='checkbox']");

    //13 Ô giá trị User Role ở dòng thứ 2
    By cellUserRoleRow2 = By.xpath("(//div[@class='oxd-table-body']/div[contains(@class,'oxd-table-card')])[2]//div[@role='cell'][3]/div");

    //14 Nút Icon Xóa ở dòng thứ 2
    By btnDeleteRow2    = By.xpath("(//div[@class='oxd-table-body']/div[contains(@class,'oxd-table-card')])[2]//i[contains(@class,'bi-trash')]/parent::button");

    //15 Nút Icon Sửa ở dòng thứ 2
    By btnEditRow2      = By.xpath("(//div[@class='oxd-table-body']/div[contains(@class,'oxd-table-card')])[2]//i[contains(@class,'bi-pencil-fill')]/parent::button");

    //16 Tiêu đề cột "User Role" trên header bảng
    By colHeaderUserRole     = By.xpath("//div[@role='columnheader' and contains(normalize-space(),'User Role')]");

    //17 Tiêm đề cột "Employee Nam"
    By colHeaderEmployeeName = By.xpath("//div[@role='columnheader' and contains(normalize-space(),'Employee Name')]");

    //18 Breadcum "Admin/User Managêmnt"
    By breadcrumb = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");

    //19 Nút mũi tên tròn thu gọn Sidebar
    By btnCollapseSidebar = By.xpath("//button[contains(@class,'oxd-main-menu-button')]");

    //20 Nút icon chevron thu gọn panel System Users
    By btnToggleFilterPanel = By.xpath("//div[contains(@class,'oxd-table-filter-header-options')]//button");

    //21 Nút "+Add" thêm người dùng mới
    By btnAdd = By.xpath("//button[normalize-space()='Add']");
}
