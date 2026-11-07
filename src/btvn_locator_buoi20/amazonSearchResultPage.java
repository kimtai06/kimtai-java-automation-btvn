package btvn_locator_buoi20;

import org.openqa.selenium.By;

public class amazonSearchResultPage {

    //1 Ảnh sản phẩm thứ 3
    By imgProduct3 = By.xpath("(//div[@data-component-type='s-search-result'])[3]//img[@class='s-image']");

    //2 Giá tiền sản phẩm thứ 4
    By priceProduct4 = By.xpath("(//div[@data-component-type='s-search-result'])[4]//span[@class='a-price']/span[@aria-hidden='true']");

    //3 Giá tiền sản phẩm thứ 2
    By priceProduct2 = By.xpath("(//div[@data-component-type='s-search-result'])[2]//span[@class='a-price']/span[@aria-hidden='true']");

    //4 Ô input tìm kiếm chính đang chứa chữ "adidas"
    By txtSearch = By.id("twotabsearchtextbox");

    //5 Icon Giỏ hàng (Cart) trên Header Amazon
    By iconCart = By.id("nav-cart");

    //6 Menu điều hướng "Today's Deals"
    By menuTodaysDeals = By.xpath("//div[@id='nav-xshop']//a[contains(normalize-space(),\"Today's Deals\")]");

    //7 Nút "Add to cart" của sản phẩm đầu tiên
    By btnAddToCartProduct1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//button[normalize-space()='Add to cart']");

    //8 Tên sản phẩm 2
    By titleProduct2 = By.xpath("(//div[@data-component-type='s-search-result'])[2]//h2[@aria-label]");

    //9 Dòng "1K+ bought in past month" của sản phẩm 1
    By txtBoughtProduct1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[contains(text(),'bought in past month')]");

    //10 Nhãn thương hiệu "adidas" của sản phẩm đầu tiên
    By lblBrandProduct1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//div[@data-cy='title-recipe']//span[normalize-space()='adidas']");

    //11 Khu vực "Results"
    By sectionResults = By.xpath("//h2[normalize-space()='Results']/ancestor::div[contains(@class,'s-result-item')][1]");

    //12 Checkbox lọc "Men"
    By chkGenderMen = By.xpath("//span[text()='Gender']/ancestor::div[1]/following-sibling::ul//span[text()='Men']/preceding-sibling::div//input");

    //13 Thanh kết quả "1-48 of over 10,000 results for'adidas'"
    By barResultInfo = By.xpath("//div[@cel_widget_id='UPPER-RESULT_INFO_BAR-0']");

    //14 Link "See more" trong sidebarlọc
    By lnkSeeMore = By.xpath("(//div[@id='s-refinements']//span[normalize-space()='See more'])[1]");
}
