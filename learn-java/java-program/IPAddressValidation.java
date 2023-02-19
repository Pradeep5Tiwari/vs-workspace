/* You will be provided with N lines of what are possibly IP addresses. You need to detect if the text contained in each of the lines represents an (a)IPv4 address (b)IPv6 address or (c)None of these.
IPv4 was the first publicly used Internet Protocol which used 4 byte addresses which permitted for 232 addresses. The typical format of an IPv4 address is A.B.C.D where A, B, C and D are Integers lying between 0 and 255 (both inclusive).
IPv6, with 128 bits was developed to permit the expansion of the address space. To quote from the linked article: The 128 bits of an IPv6 address are represented in 8 groups of 16 bits each. Each group is written as 4 hexadecimal digits and the groups are separated by colons (:). The address 2001:0db8:0000:0000:0000:ff00:0042:8329 is an example of this representation. Consecutive sections of zeros will be left as they are.
An IPv6 value such as "...:0:..." or "...:5:..." is address-wise identical to "...:0000:..." or "...:0005:....". Leading zeros may be omitted in writing the address.

Input Format
An integer N such that N <= 50. This is followed by N lines such that each the text in each line is either an IPv4 address or an IPv6 address, or a chunk of text which does not equal either of these. There will be no extra text or whitespace leading or trailing the IP address in a line (if it is an IP address). The number of characters in each line will not exceed 500.

Output Format
N lines.
The ith output line should equal (a)IPv4 or (b)IPv6 or (c)Neither depending on what you detected the ith input line to be.

Sample Input
3
This line has junk text.  
121.18.19.20  
2001:0db8:0000:0000:0000:ff00:0042:8329  

Sample Output
Neither,Neither Neither Neither Neither     
IPv4, IPv4, IPv4, IPv4, IPv4  
IPv6, IPv6, IPv6, IPv6,IPv6   */

import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
import java.util.regex.*;

class Result {

    public static List<String> validateAddresses(List<String> addresses) {
        // Write your code here
        Pattern IPv4 = Pattern.compile(
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        Pattern IPv6 = Pattern.compile(
                "(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))");
        Matcher m1, m2;
        List<String> stringArray = new ArrayList<>();
        for (int i = 0; i < addresses.size(); i++) {
            m1 = IPv4.matcher(addresses.get(i));
            m2 = IPv6.matcher(addresses.get(i));
            // result = (m1.matches())? "IPv4" : ((m2.matches()) ? "IPv6" : "Neither");
            if (m1.matches())
                stringArray.add("IPv4");
            // System.out.println("IPv4");
            else if (m2.matches())
                // System.out.println("IPv6");
                stringArray.add("IPv6");
            else
                // System.out.println("Neither");
                stringArray.add("Neither");
        }
        return stringArray;
    }
}

public class IPAddressValidation {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // BufferedWriter bufferedWriter = new BufferedWriter(new
            // FileWriter("/Users/pradeeptiwari/Documents/My-Workspace/VS-Workspace/OUTPUT_PATH"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            int addressesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> addresses = new ArrayList<>();

            for (int i = 0; i < addressesCount; i++) {
                String addressesItem = bufferedReader.readLine();
                addresses.add(addressesItem);
            }

            List<String> result = Result.validateAddresses(addresses);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(result.get(i));

                if (i != result.size() - 1) {
                    bufferedWriter.write("\n");
                }
            }

            bufferedWriter.newLine();
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}