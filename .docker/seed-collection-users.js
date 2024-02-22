db.getSiblingDB("processdb").createCollection("users");
db.getSiblingDB("processdb").users.insertMany(getAccounts());

function getAccounts() {
  return [
    {
      _id: ObjectId("2f5d8aec3ea4cfbe95728f01"),
      email: "user1234@gmail.com",
      name: "User 1234",
      phone: "81 9 9999-9999",
      createdAt: new Date(),
      updatedAt: new Date(),
    },
  ];
}
