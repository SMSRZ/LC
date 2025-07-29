class Solution {
public:
    vector<int> occurrencesOfElement(vector<int>& nums, vector<int>& queries, int x) {
    vector<int> arr;
    for(int i=0;i<nums.size();i++)
    {
        if(nums[i]==x)
        arr.push_back(i);
    }
    vector<int> res;
    for(int i=0;i<queries.size();i++)
    {
        int k=queries[i];
        if(k<=arr.size())
        {
            res.push_back(arr[k-1]);
        }
        else
        {
            res.push_back(-1);
        }
    }
    return res;
    }
};