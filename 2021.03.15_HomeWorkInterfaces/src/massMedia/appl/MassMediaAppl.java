package massMedia.appl;

import massMedia.data.*;
import massMedia.interfaces.IPrintable;

import java.util.Arrays;


public class MassMediaAppl {
    public static void main(String[] args) {
        MassMedia[] ar = {
                new WebSite("Visit Berlin", "https://www.visitberlin.de/", "Berlin Tourismus & Kongress GmbH"),
                new Newspaper("MorgenPost", 23, 10),
                new Newspaper("Bild", 2, 4),
                new Newspaper("Berliner Zeitung", 135, 16),
                new Journal("Der Spiegel", 25, 48, false),
                new Journal("Haus", 3, 54, true),
                new Journal("Focus", 16, 40, false),
                new NewsPortal("Das offizielle Hauptstadtportal", "https://www.berlin.de/"),
                new NewsPortal("Der Tagesspiegel", "https://www.tagesspiegel.de/"),
                new WebSite("Visit Berlin", "https://www.visitberlin.de/", "Berlin Tourismus & Kongress GmbH"),
                new WebSite("Tip Berlin", "https://www.tip-berlin.de/", "Berlin Media Group GmbH"),
        };
//        displayPrintable(ar);
        System.out.println(Arrays.toString(getPrintableElements(ar)));

    }

    private static void displayPrintable(MassMedia[] ar) {
        for (MassMedia m : ar) {
            if (m instanceof IPrintable) {
                System.out.println(m);
            }
        }
    }

    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
        int count = 0;
        int newIndex = 0;
        for (MassMedia m : ar) {
            if (m instanceof IPrintable) {
                count++;
            }
        }
        IPrintable[] arr = new IPrintable[count];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable) {
                arr[newIndex] = (IPrintable) ar[i];
                newIndex++;
            }
        }
        return arr;
    }

}


