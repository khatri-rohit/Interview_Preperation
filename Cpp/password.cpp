#include <bits/stdc++.h>
#include <cctype>
using namespace std;

/*
 * Complete the 'decryptPassword' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string decryptPassword(string s)
{
    // hAck3rr4nk
    // 43Ah*ck0rr0nk
    string password = "";
    for (int i = 0; i < s.length(); i++)
    {
        if (islower(s[i]) && isupper(s[i + 1]))
        {
            for (int j = 0; j < s.length(); j++)
            {
                if (j == i)
                {
                    // cout << s[i] << "\n";
                    string str = s[i + 1] + "";
                    char str1 = s[i];
                    string pass = str + str1;
                    password += pass;
                    cout << password << "\n";
                    //  << str << "\n";
                    j += 2;
                    continue;
                }
                password += s[j];
            }
            i += 2;
        }
        exit;
    }
    cout << password;
    return password;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s = "hAck3rr4nk";
    // getline(cin, s);

    string result = decryptPassword(s);

    cout << result << "\n";

    fout.close();

    return 0;
}
