import "./App.css";

import axios from "axios";
import { useEffect, useState } from "react";
function App() {
  const [name, setName] = useState(0);
  const [text, setText] = useState(0);
  const [data, setData] = useState();
  const getData = async () => {
    try {
      const response = await axios.get("/api/boards");
      setData(response.data);
      console.log(response);
      console.log(response.data);
    } catch (error) {
      console.log(error);
    }
  };
  const postData = async () => {
    try {
      const response = await axios.post("/api/boards", {
        name: name,
        text: text,
      });
      console.log(response);
      getData();
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getData();
  }, []);

  return (
    <div>
      <input type="text" onChange={(e) => setName(e.target.value)}></input>
      <input type="text" onChange={(e) => setText(e.target.value)}></input>
      <button onClick={postData}>submit</button>
      {data?.map((element) => (
        <div>
          name:{element.name} title:{element.text}
        </div>
      ))}
    </div>
  );
}

export default App;
