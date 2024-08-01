# [Plan Your Dream Wedding](https://www.codewars.com/kata/plan-your-dream-wedding "https://www.codewars.com/kata/66314d6b7cb7030393dddf8a")

This kata was created as a contender for the EPIC Challenge 2024.

## Background

It's your dream to have a magical wedding day, and you're willing to spend *every last penny on it* — while
simultaneously planning for a stable retirement income.

## Task

Your monthly surplus income (i.e., income after all taxes and mandatory monthly costs) is `C` dollars (
e.g., `C = $2,500`), and will remain so until your retirement. At the end of each month, you will invest
the surplus income in your savings account with a certain rate of monthly return `r > 0` given in percentage (
e.g., `r = 0.5` percent per month), growing with compound interest. Your savings account is initially empty.

You are planning to retire in `T` years (e.g., `T = 35`), and have calculated that upon retirement, you need minimum `S`
dollars of savings to finance a stable retirement (e.g., `S = $3,000,000`).

You are also planning to have a wedding in `W` years (e.g., `W = 5`), with `1 <= W <= T`. *What is the largest amount of
savings you can spend on the wedding while ensuring that you will also have enough money for your retirement?*

Notice that the savings spent on the wedding no longer produce investment returns at rate `r` per month. Also, you
cannot finance the wedding on debt — you can only use the savings up to the wedding date!

## Example 1

Let's say the function `max_wedding_cost(C, r, S, T, W)` gets the above inputs `C = 2_500` (dollars per
month), `r = 0.5` (percent per month), `S = 3_000_000` (dollars), `T = 35` (years) and `W = 5` (years).

If you spend zero dollars on your wedding, you will have approximately `3_561_775.75` dollars in
your savings account upon your retirement, or `561_775.75` dollars over the required `S = 3_000_000` dollars.

It turns out that the maximum amount you can spend on your wedding day is approximately `93_278.33` dollars. Your answer
should be within `0.01%` of the reference answer. See notes for further details on accuracy.

## Example 2

Suppose in the above example `S = 2_000_000`, i.e., you need a million dollars less for your retirement.

In this case it turns out that you can blow all your savings up to wedding day — a total of approximately `174_425.08`
dollars — on your wedding. Even though you have to re-start saving from scratch, you can still reach your
two-million-dollar retirement goal.

## Notes

Your magical savings account operates on double-precision floating point arithmetic, so you don't have to deal with
rounding numbers to cents. Just return the final result as a floating point number without any rounding; it only needs
to be within 0.01% of the reference solution.

It is guaranteed that with zero wedding costs,
you will reach your retirement goal `S`. Parameters will have the following
ranges: `100 <= C <= 3_000`, `0.1 <= r <= 1.0`, `100_000 <= S <= 3_000_000`, `10 <= T <= 40`, and `1 <= W <= T`.