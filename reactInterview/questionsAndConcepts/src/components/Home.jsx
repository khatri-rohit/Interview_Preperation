import { useEffect, useMemo, useRef, useState } from "react";

function Home() {
    // const [state, setState] = useState(0);
    const countRef = useRef(null);

    function calculate() {
        // console.log("State Changed " + state);
        // return state * state;
        // console.log(countRef);
        // console.log(countRef.current);
        countRef.current = countRef.current + 1;
        console.log("Clicked");
    }

    // const count = useMemo(calculate, [state]);

    useEffect(() => {
        // count
        document.addEventListener('click', calculate);
        console.log(countRef.current);
    }, []);

    return (
        <>
            <div className="">
                <h1>Hello Home {countRef.current}</h1>
                <button onClick={calculate}>
                    Update
                </button>
            </div>
        </>
    )
}

export default Home;