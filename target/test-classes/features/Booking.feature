Feature: RoomAvailability
  Background:
    Given User has set the Request Base URI

Scenario: Availability Request
  When User makes the room availability request
    |api_version|1|
    |hotel_item_id|1|
    |hotel_partner_reference|abc123|
    |start_date|2019-10-21|
    |end_date|2019-10-23|
    |adults|2|
    |children|1|
    |lang|en_US|
    |currency|USD|
    |user_country|US|
  Then Verify responded API version, dates, and user country are identical to requested ones
  And Verify that hotel_details contains name,address1 and city of type string and a valid url
  And Verify that the room_types_array contains at least one entry, or more
  And Verify that the responded room has a name and its data format is type string with at least 3 letters
  And Verify that the responded room has a final_price_at_booking and/or a final_price_at_checkout
  And Verify that the start_date is before the end_date

