package tests.javafuzzer1090;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 14:16:32 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1646932218578421884L;
    public static volatile double dFld=-108.96835;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(boolean b) {

        int i5=-111, i6=-12173, i7=63449, i8=14, i9=51136, iArr[]=new int[N];
        byte by=-27;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, 50931);
        FuzzerUtils.init(lArr, -3510820147L);

        i5 = (int)Test.dFld;
        try {
            iArr = iArr;
            i6 = 1;
            while (++i6 < 158) {
                for (i7 = 1; i7 < 10; i7++) {
                    switch (((i7 >>> 1) % 5) + 81) {
                    case 81:
                        i9 = 1;
                        do {
                            float f1=97.727F;
                            b = b;
                            Test.instanceCount = i7;
                            by = (byte)i8;
                            switch ((i9 % 2) + 38) {
                            case 38:
                                lArr[i6 + 1][i9 - 1] = Test.instanceCount;
                                f1 *= 6537;
                                break;
                            case 39:
                                i5 = i5;
                                f1 += (((i9 * Test.instanceCount) + i8) - i5);
                            default:
                                i8 *= i7;
                            }
                        } while (++i9 < 2);
                        break;
                    case 82:
                        Test.instanceCount += i7;
                        break;
                    case 83:
                        i5 = i6;
                        break;
                    case 84:
                        Test.dFld += 219;
                        break;
                    case 85:
                        Test.instanceCount += (long)Test.dFld;
                        break;
                    }
                }
            }
        }
        catch (UserDefinedExceptionTest exc1) {
            i8 = 0;
        }
        long meth_res = (b ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + by + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(float f, long l1) {

        boolean b1=true;
        int i10=68;
        short s=-1034, sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)30596);

        iMeth(b1);
        i10 -= (int)f;
        sArr[(i10 >>> 1) % N] *= s;
        vMeth1_check_sum += Float.floatToIntBits(f) + l1 + (b1 ? 1 : 0) + i10 + s + FuzzerUtils.checkSum(sArr);
    }

    public void vMeth(int i, long l) {

        int i1=-6, i2=1, i3=-14, i4=-240, i11=4120;
        short sArr1[]=new short[N];

        FuzzerUtils.init(sArr1, (short)-21864);

        for (i1 = 16; i1 < 297; i1++) {
            i2 *= (int)l;
            for (i3 = 1; 6 > i3; i3++) {
                float f2=-1.619F;
                i2 |= (++i);
                i2 += (--i2);
                vMeth1(110.877F, l);
                if (false) continue;
                Test.instanceCount = (long)f2;
                iArrFld = iArrFld;
                i11 = 1;
                while (++i11 < 2) {
                    sArr1[i3] = (short)i4;
                    i2 += (((i11 * Test.instanceCount) + i1) - i4);
                    iArrFld[i11 + 1] = i4;
                    i4 += (-52774 + (i11 * i11));
                    i2 = 64449;
                }
            }
        }
        vMeth_check_sum += i + l + i1 + i2 + i3 + i4 + i11 + FuzzerUtils.checkSum(sArr1);
    }

    public void mainTest(String[] strArr1) {

        int i12=13;

        vMeth(i12, -3686L);
        i12 = -2;


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
