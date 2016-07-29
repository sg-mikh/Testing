package framework;

import org.openqa.selenium.By;
import tests.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData group) {
       driver.findElement(By.name("group_name")).clear();
       driver.findElement(By.name("group_name")).sendKeys(group.groupname);
       driver.findElement(By.name("group_header")).clear();
       driver.findElement(By.name("group_header")).sendKeys(group.header);
       driver.findElement(By.name("group_footer")).clear();
       driver.findElement(By.name("group_footer")).sendKeys(group.footer);
    }

    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void returnToGroupsPage() {
        driver.findElement(By.linkText("group page")).click();
    }
}