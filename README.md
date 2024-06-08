# Rotating-an-Array
<br>
<h3>
  Problem Statment
</h3><br>
<p>
  Given an integer Array arr,rotate the Array to the right by K steps,where K is non-negative
  <h4>Example:1</h4>
  &nbsp;Input: nums = [1,2,3,4,5,6,7], k = 3<br>
&nbsp;Output: [5,6,7,1,2,3,4]<br>
Explanation:<br>
&nbsp;rotate 1 steps to the right: [7,1,2,3,4,5,6]<br>
&nbsp;rotate 2 steps to the right: [6,7,1,2,3,4,5]
&nbsp;rotate 3 steps to the right: [5,6,7,1,2,3,4]
<h4>Example 2:</h4>
&nbsp;Input: nums = [-1,-100,3,99], k = 2<br>
&nbsp;Output: [3,99,-1,-100]<br>
Explanation:<br> 
&nbsp;rotate 1 steps to the right: [99,-1,-100,3]<br>
&nbsp;rotate 2 steps to the right: [3,99,-1,-100]<br>
</p>
<br><h3>Algorithm</h3>
<p>
      First take modulus of K wrt length of Array , to reduce number of extra repetative rounds.<br>
  <br>Now Create a Method/function for flipping array from one particular to another particular index.<br>
  <br>We need to flip the matrix three times in order to get desired outuput<br>
      &nbsp;first from 0 to n-k-1(where n=nums.length)<br>
      &nbsp;second from n-k to n-1;<br>
      &nbsp;then from 0 to n-1;<br>
</p>
<br>
<h3>
  Here is the code snippent in Java Language
</h3>
<p>
  ![Rotating Linear Array](https://github.com/GovindSingh-95/Rotating-an-Array/assets/156602160/d6cedf1d-7318-49b1-b8f9-4639f5dd51f1)

</p>
