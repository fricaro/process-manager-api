db.getSiblingDB("processdb").createCollection("processes");
db.getSiblingDB("processdb").processes.insertMany(getProcesses());

function getProcesses() {
  return [
    {
      _id: ObjectId("1f5d8aec3ea4cfbe95728f00"),
      type: "DOCUMENT",
      name: "Entrega de arquivos",
      status: "RUNNING",
      userId: ObjectId("2f5d8aec3ea4cfbe95728f01"),
      startDate: new Date(),
      finishDate: new Date(),
      createdAt: new Date(),
      updatedAt: new Date(),
    },
  ];
}
