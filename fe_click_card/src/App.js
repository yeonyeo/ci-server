// import logo from './logo.svg';
// import React from 'react';
// import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
// import './App.css';
// import CardInformation from './component/Card';

// // import logo from './logo.svg';
// import './App.css';


// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <Routes>
//         <Route path="/" element={<CardInformation />} />
//         </Routes>
//       </header>
//     </div>
//   );
// }

// export default App;
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import './App.css';
import CardInformation from './component/CardInformation';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Router>
          <Routes>
            <Route path="/" element={<CardInformation />} />
          </Routes>
        </Router>
      </header>
    </div>
  );
}

export default App;

