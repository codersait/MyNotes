const fakeApi = new Promise((resolved, reject) => {
  const fakeData = {
    data: [
      {
        id: 1,
        title: "konuadi",
        order: 2,
      },
      {
        id: 2,
        title: "javascript",
        order: 3,
      },
      {
        id: 3,
        title: "nodejs",
        order: 1,
      },
      {
        id: 4,
        title: "php",
        order: 5,
      },
      {
        id: 5,
        title: "java",
        order: 4,
      },
    ],
  };
  resolved(fakeData);
});

