package massMedia.data;

import massMedia.interfaces.IPrintable;

public class Journal extends MassMedia implements IPrintable {
    int issueNumber;
    int numberOgPages;
    boolean glossy;

    public Journal(String name, int issueNumber, int numberOgPages, boolean glossy) {
        super(name);
        this.issueNumber = issueNumber;
        this.numberOgPages = numberOgPages;
        this.glossy = glossy;
    }

    public Journal() {
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getNumberOgPages() {
        return numberOgPages;
    }

    public void setNumberOgPages(int numberOgPages) {
        this.numberOgPages = numberOgPages;
    }

    public boolean isGlossy() {
        return glossy;
    }

    public void setGlossy(boolean glossy) {
        this.glossy = glossy;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", numberOgPages=" + numberOgPages +
                ", glossy=" + glossy +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {

    }
}
