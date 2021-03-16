package massMedia.data;

import massMedia.interfaces.IPrintable;

public class Newspaper extends MassMedia implements IPrintable {
    int issueNumber;
    int numberOgPages;

    public Newspaper(String name, int issueNumber, int numberOgPages) {
        super(name);
        this.issueNumber = issueNumber;
        this.numberOgPages = numberOgPages;
    }

    public Newspaper() {

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

    @Override
    public String toString() {
        return "Newspaper{" +
                "issueNumber=" + issueNumber +
                ", numberOgPages=" + numberOgPages +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {

    }
}
