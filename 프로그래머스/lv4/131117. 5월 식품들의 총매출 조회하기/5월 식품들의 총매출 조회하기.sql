-- 코드를 입력하세요
SELECT FP.PRODUCT_ID, PRODUCT_NAME, SUM(FO.AMOUNT)*FP.PRICE AS TOTAL_SALES 
  FROM FOOD_PRODUCT FP JOIN FOOD_ORDER FO ON FP.PRODUCT_ID = FO.PRODUCT_ID 
 WHERE FO.PRODUCE_DATE LIKE '2022-05-%'
 GROUP BY PRODUCT_ID 
 ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC; 


# SELECT *
#   FROM FOOD_PRODUCT FP JOIN FOOD_ORDER FO ON FP.PRODUCT_ID = FO.PRODUCT_ID 
#    WHERE FO.PRODUCE_DATE LIKE '2022-05-%';