import "./App.css";

import axios from "axios";
import { useEffect, useState } from "react";
function App() {
  const [name, setName] = useState("");
  const [text, setText] = useState("");
  const [data, setData] = useState();
  const [comment, setComment] = useState("");

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
  const getComments = async () => {
    try {
      const response = await axios.get("/api/comments");
      setData(response.data);
      console.log(response);
      console.log(response.data);
    } catch (error) {
      console.log(error);
    }
  };
  const postComments = async () => {
    try {
      const response = await axios.get("/api/comments", {
        comment: comment,
      });
      console.log(response);
      getData();
    } catch (error) {
      console.log(error);
    }
  };
}

useEffect(() => {
  getData();
  getComments(); // /api/comments 엔드포인트 호출
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
    <div>
      <input type="a" onChange={(e) => setComment(e.target.value)}></input>
      <button>Comment</button>
      <button onClick={postComments}>open</button>
      {comment.map((items) => (
        <div key={items.id}>{items.text}</div>
      ))}
    </div>
  </div>
);

export default App;
