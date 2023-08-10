# Check if it is possible to survive on Island
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Ishika got stuck on an island. There is only one shop on this island and it is open on all days of the week except for Sunday. Consider following constraints:</span></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">N – The maximum unit of food you can buy each day.</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">S – Number of days you are required to survive.</span></li>
	<li style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">M – Unit of food required each day to survive.</span></li>
</ul>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Currently, it’s Monday, and she needs to survive for the next S days.<br style="user-select: auto;">
<strong style="user-select: auto;">Find the minimum number of days on which you need to buy food from the shop so that she can survive the next S days,&nbsp;</strong>or determine that it isn’t possible to survive. </span></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 1:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> S = 10, N = 16, M = 2
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explaination:</strong> One possible solution is to 
buy a box on the first day (Monday), 
it’s sufficient to eat from this box up to 
8th day (Monday) inclusive. Now, on the 9th 
day (Tuesday), you buy another box and use 
the chocolates in it to survive the 9th and 
10th day.</span></pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong> S = 10, N = 20, M = 30
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explaination:</strong> She can’t survive even if 
she buy food because the maximum number 
of units she can buy in 1 day is less the 
required food for 1 day.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You do not need to read input or print anything. Your task is to complete the function <strong style="user-select: auto;">minimumDays()</strong> which takes S, N, and M as input parameters and returns the minimum number of days Ishika needs to buy food. Otherwise, returns -1 if she cannot survive.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong> O(1)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(1)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 ≤ N, S ≤ 50<br style="user-select: auto;">
1 ≤ M ≤ 30</span></p>
</div>