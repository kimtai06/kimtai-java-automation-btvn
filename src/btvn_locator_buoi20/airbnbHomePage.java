package btvn_locator_buoi20;

import org.openqa.selenium.By;

public class airbnbHomePage {

    //1. Logo CyberSoftbnb (Airbnb) góc trên bên trái
    By logo = By.xpath("//nav//img[@alt='Cyber Logo']/parent::a");

    //2 Link menu điều hướng "Home" trên Header
    By menuHome  = By.xpath("//nav//ul[contains(@class,'menu-phone')]//a[text()='Home']");

    //3 Link menu điều hướng "About" trên Header
    By menuAbout = By.xpath("//nav//ul[contains(@class,'menu-phone')]//a[text()='About']");

    //4 Icon User profile ở góc trên bên phải
    By iconUserProfile = By.xpath("//div[@id='user-dropdown']/following-sibling::button[img]");

    //5 Ô chọn "Địa điểm / Bạn sắp đi đâu?"
    By boxLocation = By.xpath("//p[text()='Địa điểm']/parent::div");

    //6 Ô chọn ngày "07/12/2024 - 14/12/2024"
    By boxDateRange = By.xpath("//p[text()='Địa điểm']/ancestor::div[contains(@class,'grid-cols-12')]/div[contains(@class,'col-span-4')]");

    //7 Nút Tìm kiếm (Icon kính lúp màu hồng)
    By btnSearch = By.xpath("//p[text()='Thêm khách']/following-sibling::div[.//span[contains(@class,'anticon-search')]]");

    //8 Nút tăng số lượng khách (+) trong popup
    By btnGuestIncrease = By.xpath("//div[text()='Khách']/following-sibling::div/button[normalize-space()='+']");

    //9 Nút giảm số lượng khách (-) trong popup
    By btnGuestDecrease = By.xpath("//div[text()='Khách']/following-sibling::div/button[normalize-space()='-']");

    //10 Card điểm đến nổi bật "Hồ Chí Minh"
    By cardHoChiMinh = By.xpath("//h2[text()='Hồ Chí Minh']/ancestor::div[contains(@class,'ant-card')][1]");

    //11 Tiêu đề "Cần Thơ" trong thẻ điểm đến Cần Thơ
    By titleCanTho = By.xpath("//h2[text()='Cần Thơ']");

    //12  Nút lọc "Loại nơi ở" (Filter button)
    By btnFilterLoaiNoiO = By.xpath("//button[normalize-space()='Loại nơi ở']");

    //13 Nút lọc "Giá" (Filter button)
    By btnFilterGia      = By.xpath("//button[normalize-space()='Giá']");

    //14 Đoạn text "6.5 giờ lái xe" trong thẻ Nha Trang
    By txtNhaTrangDriveTime = By.xpath("//h2[text()='Nha Trang']/following-sibling::p[contains(normalize-space(),'6.5 giờ')]");
}