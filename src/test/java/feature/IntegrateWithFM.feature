Feature: LeafTaps Automation with Integration

@DeleteLead
Scenario Outline: DeleteLead Integration with POM
And Enter Username as <userName>
And Enter Password as <password>
When Login click
When click on crmsfa
And clk leads
And Click findleads
And Click Email 
And Enter Email as <email>
And Click FindLeadsBtn
And Get First LeadId
And Click First LeadId
And Clk dl
And Click findleads
And Give LeadId as <>
And Click FindLeadsBtn
Then verify as <msg>

Examples:
|userName|password|email||msg|
|DemosalesManager|crmsfa|@||no records to display|

@Merge
Scenario Outline: Merge Leads
And Merge Enter userName as <userName>
And Merge Enter password as <password>
When Merge Click Login Button
And Merge Click CRMSFA
And Merge Click Leads
And Merge Click MergeLead
And Merge Click FromLead
And Merge Give FisrtName as <firstName>
And Merge Click FindBtn
And Merge Get FirstLeadID
And Merge Click FirstLeadID
And Merge Click ToLead
And Merge Give FisrtName as <ToLeadfirstName>
And Merge Click FindBtn
And Merge Click FirstLeadID
And Merge Click MergeBtn
And Merge Click findLead
And Merge Give LeadId
And Merge Click FindBtn
Examples:
|userName|password|firstName|ToLeadfirstName|
|DemoSalesManager|crmsfa|s|priya|