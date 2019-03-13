# Task-2-


## Features To Be tested:


- Chart of Accounts: verify if a master account can have a hierarchy of detail accounts underneath it. This allows similar account types to be grouped into one master account.
- Split Transactions: A single transaction can be split into several pieces to record taxes, fees, and other compound entries.
- Double Entry: 
 * Every transaction must debit one account and credit another by an equal amount.
 * This ensures that the "books balance": that the difference between income and outflow exactly
    equals the sum of all assets, be they bank, cash, stock or other.
- Income/Expense Account Types (Categories): These serve not only to categorize your cash flow, but when used properly with the double-entry feature, these can provide an accurate Profit&Loss statement.
 - Scheduled Transactions: GnuCash has the ability to automatically create and enter transactions.
 - Export to XML, QIF or OFX. Also, scheduled exports to 3rd-party sync services 
 - Reports: View summary of transactions (income and expenses) as pie/bar/line charts  
 - Transaction: verify with non default splits import
 - Simple transaction: Import
 - Simple Scheduled Transaction Import
 - Multi Currency TransactionImport
 - Importing Scheduled Action_should Set By Days
 
 ## This is a mind map on all possible app paths to be tested 
- Setting up the user preference 
- Main Menu
  Book
  Book Nummer Select
  Recent
- All
- Favorite
- Insert button
- Account Name
- Currency 
- Account type	
- Drop down list
- Account details
- Place holder account
- Book managing 
- Open
- Internal storage
- Favorites 
- Report
- Pie chart
- Balance Sheet
- Linear Diagram
- Block Diagram view
- Summary
- Period	
- Monthly
- Quartal
- Yearly
- Planned Actions 
- Export
- Export target 		
- Dropbox
- Send to
- Owncloud
- Format
  CSV > Separator
  QIF 
  XML
- Date
- Delete the booking after the export
- Settings
- Help und Feedback



## Attached Automated tests where done using Espresso recorder in Android studio with Gradle 4.4 
