# include <iostream>

using namespace std;

vector<int> twoSum(const vector<int>& numbers, int target) {
    int start = 0;
    int end = numbers.size() - 1;

    while (start <= end) {

        if ((numbers.at(start) + numbers.at(end)) == target) break;

        if ((numbers.at(start) + numbers.at(end)) < target) {
            start++;
        }

        end++;
    }

    return vector<int> {start + 1, end + 1};
}

int main(void) {

}