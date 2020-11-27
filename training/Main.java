import documents.LicenseDocument;
import documents.PassDocument;

import static documents.Printer.print;

public class Main {

    public static void main(String[] args) {

        PassDocument passDocument = new PassDocument();
        print(passDocument);

        LicenseDocument licenseDocument = new LicenseDocument();
        print(licenseDocument);
    }

}
