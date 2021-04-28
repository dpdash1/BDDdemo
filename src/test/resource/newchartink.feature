Feature: Title of your feature
  I want to use this template for my feature file
    
  #PROGRAM STARTS FROM HERE 
  
  @demorun
  Scenario: Title of your scenario
    Given I open browser
    Given I wait for 5 seconds
    Given I close browser 
    
  @newchartink @chartink_save_single_daily_chart
  Scenario: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/banknifty.html
    Given I am on ChartinkPage Screen
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page
    Given I close browser

  @newchartink @chartink_save_daily_charts
  Scenario: Title of your scenario
    Given I open browser
    Given I hit the URLs from the url_list text file and save the charts in daily_charts folder
    Given I close browser
    
  @newchartink @convert_daily_charts_into_pdf
  Scenario: Title of your scenario
    Given Delete old images from the images folder
    Given Copy all newly downloaded png files into images folder
    Given Add all daily chart images into one url_list pdf file
    
  @newchartink @delete_old_downloaded_pngs
  Scenario: Title of your scenario
    Given Delete old images from the downloads folder


#ALL OPERATIONS FOR SELECTED MONTH OR DAY PERIOD (DAILY CHART)
#-------------------------------------------------------------

#ALL OPERATIONS FOR 3 MONTH URL LIST (DAILY CHART)
#------------------------------------------------------------- 
#run_all_chartink_operations_3_months_mcwatchlist1
#run_all_chartink_operations_3_months_mcwatchlist2
#run_all_chartink_operations_3_months_mcwatchlist3
#run_all_chartink_operations_3_months_mcwatchlist4
#run_all_chartink_operations_3_months_mcwatchlist5
#run_all_chartink_operations_3_months_mcwatchlist6
#run_all_chartink_operations_3_months_mcwatchlist7
#run_all_chartink_operations_3_months_mcwatchlist_generate_pdf
    
  @newchartink @run_all_chartink_operations_3_months_mcwatchlist1
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    #below is the number of months for the chart type which comes from the dropdown menu
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    #Given Delete old images from the images folder
    #Given Copy all newly downloaded png files into images folder
    #Given Add all daily chart images into one <Chartlist_Type> pdf file
    #Given Delete old images from the downloads folder
    
    Examples:
    |Chartlist_Type|
    |moneycontrol_watchlist1|
    
  @newchartink @run_all_chartink_operations_3_months_mcwatchlist2
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    #|url_list|
    |moneycontrol_watchlist2|
    
  @newchartink @run_all_chartink_operations_3_months_mcwatchlist3
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    #|url_list|
    |moneycontrol_watchlist3|
    
  @newchartink @run_all_chartink_operations_3_months_mcwatchlist4
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    #|url_list|
    |moneycontrol_watchlist4|
    
    
  @newchartink @run_all_chartink_operations_3_months_mcwatchlist5
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    #|url_list|
    |moneycontrol_watchlist5|
    
    
    @newchartink @run_all_chartink_operations_3_months_mcwatchlist6
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    #|url_list|
    |moneycontrol_watchlist6|
    
    @newchartink @run_all_chartink_operations_3_months_mcwatchlist7
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    #|url_list|
    |moneycontrol_watchlist7|
    
  @newchartink @run_all_chartink_operations_3_months_mcwatchlist_generate_pdf
  Scenario Outline: Title of your scenario
    Given Delete old images from the images folder
    Given Copy all newly downloaded png files into images folder
    Given Add all daily chart images into one <Chartlist_Type> pdf file
    Given Delete old images from the downloads folder
    
    Examples:
    |Chartlist_Type|
    |moneycontrol_watchlist|
    
    
    
#ALL OPERATIONS FOR 3 MONTH URL LIST (DAILY CHART)
#------------------------------------------------------------- 


  @chartink @run_all_chartink_operations_3_months_urllist1
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    |url_list1|
    
  @chartink @run_all_chartink_operations_3_months_urllist2
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    |url_list2|
    
  @chartink @run_all_chartink_operations_3_months_urllist3
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    |url_list3|
    
  @chartink @run_all_chartink_operations_3_months_urllist4
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    |url_list4|
    
  @chartink @run_all_chartink_operations_3_months_urllist5
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    |url_list5|
    
  @chartink @run_all_chartink_operations_3_months_urllist6
  Scenario Outline: Title of your scenario
    Given I open browser
    Given I navigate to https://chartink.com/stocks/nifty.html
    Given I am on ChartinkPage Screen
    Given I select three_months from period dropdown
    Given I click on btn_updateChart button
    Given I navigate into the ChartImage Frame
    Given I click on saveImage button
    Given I wait for 15 seconds
    Given I come out of the frame to the main page 
    Given I hit the URLs from the <Chartlist_Type> text file and save the charts in daily_charts folder
    Given I close browser
    
    Examples:
    |Chartlist_Type|
    |url_list6|
  
    
  @newchartink @run_all_chartink_operations_3_months_urllist_generate_pdf
  Scenario Outline: Title of your scenario
    Given Delete old images from the images folder
    Given Copy all newly downloaded png files into images folder
    Given Add all daily chart images into one <Chartlist_Type> pdf file
    Given Delete old images from the downloads folder
    
    Examples:
    |Chartlist_Type|
    |url_list|
    
  @run_all_batch_files
  Scenario: Title of your scenario
    Given I run all batch files in all_batch_files folder
    
