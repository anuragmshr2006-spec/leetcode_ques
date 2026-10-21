class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i = n - 2 ; i >= 0 ; i--){
            // phiche se pop karne me ek fayada ye bhi hai ke chota wala element pop ho jaega jisko koi (let say example ka 10 wala) 5 ko nahi dekh paega wo bhi case isme consider ho jaega
  int count = 0;
  while(st.size() > 0 && st.peek() <= arr[i]){
    count++;
    st.pop();
  }
  if(st.size() > 0) count++;
  ans[i] = count;
  st.push(arr[i]);
        }
        return ans;
    }
}