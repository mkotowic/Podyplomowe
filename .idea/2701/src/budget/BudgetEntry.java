package budget;

import java.math.BigDecimal;
import java.util.Date;

public class BudgetEntry {
    private BigDecimal amount;
    private String entryName;
    private Date entrtDate;

    @Override
    public String toString() {
        return "BudgetEntry{" +
                "amount=" + amount +
                ", entryName='" + entryName + '\'' +
                ", entrtDate=" + entrtDate +
                '}';
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public Date getEntrtDate() {
        return entrtDate;
    }

    public void setEntrtDate(Date entrtDate) {
        this.entrtDate = entrtDate;
    }
}
