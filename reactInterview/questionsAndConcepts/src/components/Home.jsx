import { useContext, useEffect, useMemo, useRef, useState } from "react";
import { ContextProvider, Theme } from "../context/context.jsx";

function Home() {
    // const [state, setState] = useState(0);
    const countRef = useRef(null);

    // const { value } = useContext(Theme);
    // console.log(value);

    function calculate() {
        // console.log("State Changed " + state);
        // return state * state;
        // console.log(countRef);
        // console.log(countRef.current);
        // countRef.current = countRef.current + 1;
        console.log("Clicked");
    }

    // const count = useMemo(calculate, [state]);
    useEffect(() => {
        // document.addEventListener('mousemove', calculate);

        // Cleanup function to remove event listener
        // return () => {
        //     document.removeEventListener('click', calculate);
        // };
    }, []);

    return (
        <>
            {/* <ContextProvider */}
            <Theme.Consumer>
                {({ value }) => (
                    <div className="">
                        <h1>
                            Hello Home {value}{countRef.current}
                        </h1>
                        <button onClick={calculate}>
                            Update
                        </button>
                    </div>

                )}
            </Theme.Consumer>
        </>
    )
}

export default Home;