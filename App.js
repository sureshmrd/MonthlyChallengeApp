import './App.css';
import ChallengeList from './components/ChallengeList';
import { useEffect, useState } from 'react';
import axios from 'axios';
import AddChallenge from './components/AddChallenge';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {

  const [Challenges,setChallenges]=useState([]);

  useEffect(()=>{
    fetchChallenges();
  },[])
  const fetchChallenges =async ()=>{
    try{ const response=await axios.get('http://localhost:8080/challenges');
    //console.log(response.data);
    setChallenges(response.data);
  }
   catch(error){
    console.error("error fetching data...");
   }
  };

  const handleChallangeAdded = ()=>{
    fetchChallenges();
  }
  // console.log(Challenges);
  return (
   
    <div className="container mt-5 ">
      <h1 className='text-center mb-4'>Monthly Challenges</h1>
      <AddChallenge onChallengeAdded={handleChallangeAdded}/>
      <ChallengeList challenges={Challenges}/>
    </div>
 
  );
}

export default App;
