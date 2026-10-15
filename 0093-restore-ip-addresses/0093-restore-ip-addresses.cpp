
class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        vector<string> ans;
        string path;

        backtrack(s, 0, 0, path, ans);
        return ans;
    }

    void backtrack(string &s, int index, int parts,
                   string path, vector<string> &ans) {
        if (parts == 4 && index == s.size()) {
            path.pop_back(); // Remove last '.'
            ans.push_back(path);
            return;
        }

        if (parts == 4 || index == s.size())
            return;

        for (int len = 1; len <= 3 && index + len <= s.size(); len++) {
            string segment = s.substr(index, len);

            // Leading zero is not allowed
            if (len > 1 && segment[0] == '0')
                break;

            // Segment must be between 0 and 255
            if (stoi(segment) > 255)
                break;

            backtrack(s, index + len, parts + 1,
                      path + segment + ".", ans);
        }
    }
};
